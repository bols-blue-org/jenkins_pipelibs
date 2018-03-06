package jp.lnc.jenkins.libs;

// point in 3D space
class Point2 {
  float x,y,z;

  int getInt(){
    return 10
  }
}
def call(args) {
  def fileexist = new File("../.LAST_HASH").exists()
  println ret + "fileexist:" + fileexist
  if (fileexist) {
    ret = sh(script: 'cat ../.LAST_HASH', returnStdout: true)
    println ret
  }else{
    ret = "b7f6479086e4ef3c01b7f6ea21d71a121239953d"
  }
  env.LAST_HEAD = ret
  ret = sh(script: 'git log --pretty=oneline --abbrev-commit $LAST_HEAD..master doc/external/api/swagger.yaml |sed "s/#/CPSPlatform\\/cpspgear#/g"', returnStdout: true)
  println ret
  sh(script: 'git rev-parse HEAD > ../.LAST_HASH')
  return ret
}
