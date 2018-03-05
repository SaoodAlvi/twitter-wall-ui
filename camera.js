const createCamera = require('perspective-camera')

const TAU = 6.283185307179586
const FOV = TAU * 0.1
const ORIGIN = [0, 0, 0]

module.exports = createCamera({
  fov: FOV,
  near: 0.01,
  far: 100,
  position: [0, 0, 1]
})
