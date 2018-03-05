const glsl = require('glslify')
const mat4 = require('gl-mat4')
const camera = require('./camera')

module.exports = function (regl) {
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
