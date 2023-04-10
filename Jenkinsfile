pipeline{

agent any
stages{

stage('Checkout'){
steps{
git branch: "main", url: 'https://github.com/sangeetaPalankar/jenkins-docker-demo.git'
}

}

stage('Build'){
steps{
sh 'chmod a+x mvnw'
sh './mvnw clean package -DskipTests=true' 
			}
			
			post{
				always{
					archiveArtifacts 'target/*.jar'
				}
			}
		}
		
		stage(DockerBuild){
			steps{
				sh 'docker build -t sangeetapalankar/jenkins-docker-demo:demo1 .'
			}
		}
		
	}
}


