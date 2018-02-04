const glsl = require('glslify')
const mat4 = require('gl-mat4')
const createCamera = require('perspective-camera')

const TAU = 6.283185307179586
const FOV = TAU * 0.1
const ORIGIN = [0, 0, 0]

module.exports = function (regl) {
  const camera = createCamera({
    fov: FOV,
    near: 0.01,
    far: 100,
    position: [0, 0, 1]
  })

  return regl({
    vert: glsl`
      precision mediump float;
      attribute vec2 position;
      uniform mat4 inverseProjection, inverseView;
      varying vec3 vDirection;

      void main () {
        vDirection = mat3(inverseView) * (inverseProjection * vec4(position, 0, 1)).xyz;
        gl_Position = vec4(position, 0.999, 1);
      }
    `,
    frag: glsl`
      precision mediump float;
      #pragma glslify: computeBackground = require(./background)

      uniform float time;
      varying vec3 vDirection;

      void main () {
        vec3 direction = normalize(vDirection);
        gl_FragColor = computeBackground(direction, time);
      }
    `,
    attributes: {
      position: [[-4, -4], [0, 4], [4, -4]]
    },
    uniforms: {
      projection: () => camera.projection,
      inverseProjection: () => mat4.invert([], camera.projection),
      inverseView: () => mat4.invert([], camera.view),
      view: () => camera.view,
      time: ({time}) => time
    },
    count: 3
  })
}
