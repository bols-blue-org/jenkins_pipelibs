
def call(String name = 'human') {
  def myShell = libraryResource 'jp/lnc/jenkins/libs/my_shell.sh'
  return sh myShell
}
