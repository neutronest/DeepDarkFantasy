package com.thoughtworks.DDF.Arr

import com.thoughtworks.DDF.{NoInfo, Show}

trait SimpleArr[Repr[_]] extends ArrLang[NoInfo, Repr] {
  override def ArrDomInfo[A, B] = _ => NoInfo()

  override implicit def ArrInfo[A, B](implicit ai: NoInfo[A], bi: NoInfo[B]) = NoInfo()

  override def ArrRngInfo[A, B] = _ => NoInfo()

  override def ReprInfo[A] = _ => NoInfo()
}
