package org.rogach.scallop

object Main {
  def main(args: Array[String]): Unit = {
    val conf = new ScallopConf(List("-a","3")) {
      val apples = opt[Int]("apples")
      verify()
    }
    assert(conf.apples() == 3)
    assert(
      conf.builder.help ==
        """  -a, --apples  <arg>
          |      --help            Show help message""".stripMargin
    )
  }
}
