def call(String ProjectName,String ImageTag){
  withCredentials([usernamePassword(
                    credentialsId:"dockerhubCred",
                    passwordVariable:"dockerhubPass",
                    usernameVariable:"dockerhubUser")]){
                        sh "docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}"
                        sh "docker image tag ${ProjectName}:${ImageTag} ${env.dockerhubUser}/${ProjectName}:${ImageTag}"
                        sh "docker push ${env.dockerhubUser}/${ProjectName}:${ImageTag}"
                    }
}
