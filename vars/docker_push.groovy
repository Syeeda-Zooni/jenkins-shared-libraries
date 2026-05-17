def call(String ProjectName,String ImageTag){
  withCredentials([usernamePassword(
                    credentialsId:"dockerhubCred",
                    passwordVariable:"dockerhubPass",
                    usernameVariable:"dockerhubUser")]){
                        sh "docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}"
                        sh "docker image tag notes-app:latest ${env.dockerhubUser}/notes-app:latest"
                        sh "docker push ${env.dockerhubUser}/notes-app:latest"
                    }
}
