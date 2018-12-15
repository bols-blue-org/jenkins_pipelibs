
def call() {
  def myShell = libraryResource 'jp/lnc/jenkins/libs/my_shell.sh'
  return sh myShell
}
