def call(String GitUrl, String GitBranch){
  echo "This cloning the source code"
  git url: "${GitUrl}" , branch: "${GitBranch}"
}
