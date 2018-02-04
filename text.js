const glsl = require('glslify')
const mat4 = require('gl-mat4')
const createCamera = require('perspective-camera')
const vectorizeText = require('vectorize-text')

const DUST_COUNT = 1000

const TAU = 6.283185307179586
const FOV = TAU * 0.1
const ORIGIN = [0, 0, 0]

module.exports = function dustDrawer(regl) {

  const camera = createCamera({
    fov: FOV,
    near: 0.01,
    far: 100,
    position: [0, 0, 1]
  })

  const textMesh = vectorizeText('hello regl!', {
    textAlign: 'center',
    textBaseline: 'middle'
  })

  return regl({
    frag: `
      precision mediump float;
      void main () {
        gl_FragColor = vec4(1, 1, 1, 1);
      }
    `,

    vert: `
      attribute vec2 position;
      uniform mat4 projection, view;
      void main () {
        gl_Position = projection * view * vec4(0.05 * position, 0, 1);
      }
    `,

    attributes: {
      position: textMesh.positions
    },

    elements: textMesh.edges,

    uniforms: {
      view: () => camera.view,
      projection: () => camera.projection
    },

    depth: { enable: false }
  })
}
