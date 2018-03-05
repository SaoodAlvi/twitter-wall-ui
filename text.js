const glsl = require('glslify')
const mat4 = require('gl-mat4')

module.exports = function (regl) {

  return function (camera) {
    return regl({
      frag: `
        precision mediump float;
        uniform sampler2D texture;
        varying vec2 uv;
        void main () {
          gl_FragColor = texture2D(texture, uv);
        }
      `,

      vert: `
        attribute vec2 position;
        uniform mat4 projection, view;
        varying vec2 uv;
        void main () {
          uv = position;
          gl_Position = projection * view * vec4(1.0 - 2.0 * position, 0, 1);
        }
      `,

      attributes: {
        position: [
          -2, 0,
          0, -2,
          2, 2]
      },

      uniforms: {
        view: () => camera.view,
        projection: () => camera.projection,
        texture: regl.texture(createText())
      },

      depth: {
        enable: false
      },

      count: 3
    })
  }
}

function createText () {
  const canvas = document.createElement('canvas')
  const ctx = canvas.getContext('2d')
  document.body.appendChild(canvas)
  ctx.fillStyle = '#FF0000'
  ctx.fillRect(0, 0, 20, 20)
  return canvas
}
