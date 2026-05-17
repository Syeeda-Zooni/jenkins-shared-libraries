def call(String DockerHubUser, String ProjectName, String ImageTag){
  echo "This is building the code"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
