const regl = require('regl')()
const glslify = require('glslify')
const setupScene = require('./scene')(regl)
const drawBackground = require('./background')(regl)
const drawDust = require('./dust')(regl)
const clear = { depth: 1, color: [0, 0, 0, 1] }

const frameLoop = regl.frame(() => {
  try {
    regl.clear(clear)
    setupScene(({ time }) => {
      drawBackground()
      drawDust()
    })
  } catch (error) {
    console.error(error)
    frameLoop.cancel()
  }
})
