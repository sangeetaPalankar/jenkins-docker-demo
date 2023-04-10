pipeline{

agent any
stages{

stage('Checkout'){
steps{
git branch: "main", url: 'https://github.com/sangeetaPalankar/jenkins-docker-demo.git'
}

}


		
		stage(DockerBuild){
			steps{
				sh 'docker build -t sangeetapalankar/jenkins-docker-demo:physicianavailability .'
			}
		}
		
	}
}


