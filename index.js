const regl = require('regl')()
const glslify = require('glslify')
const drawBackground = require('./background')(regl)
const drawDust = require('./dust')(regl)
const drawText = require('./text')(regl)
const createCamera = require('perspective-camera')
const clear = { depth: 1, color: [0, 0, 0, 1] }

const TAU = 6.283185307179586
const FOV = TAU * 0.1
const ORIGIN = [0, 0, 0]

const camera = createCamera({
  fov: FOV,
  near: 0.01,
  far: 100,
  position: [0, 0, 1]
})

const frameLoop = regl.frame(() => {
  try {
    regl.clear(clear)
      drawBackground()
      drawDust()
      drawText()
  } catch (error) {
    console.error(error)
    frameLoop.cancel()
  }
})
