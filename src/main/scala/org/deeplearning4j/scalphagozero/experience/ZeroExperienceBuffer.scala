package org.deeplearning4j.scalphagozero.experience

import java.io.File

class ZeroExperienceBuffer {}

object ZeroExperienceBuffer {

  def combineExperience(buffers: List[ZeroExperienceBuffer]): ZeroExperienceBuffer =
    new ZeroExperienceBuffer() // TODO

  def loadExperience(file: File): ZeroExperienceBuffer =
    new ZeroExperienceBuffer // TODO
}
