const regl = require('regl')()
const glslify = require('glslify')
const drawBackground = require('./background')(regl)
const drawDust = require('./dust')(regl)
const drawText = require('./text')(regl)
const clear = { depth: 1, color: [0, 0, 0, 1] }

const frameLoop = regl.frame(() => {
  try {
      regl.clear(clear)
      drawBackground()
      drawDust()
      //drawText(camera)()
  } catch (error) {
    console.error(error)
    frameLoop.cancel()
  }
})
