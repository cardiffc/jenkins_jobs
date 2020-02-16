job('Build Code DSL') {
	description('Build code for maven tomcat in new pipeline')
	logRotator {
		artifactDaysToKeep(5)
        	artifactNumToKeep(5)
	}
	
	scm() {
		git('https://github.com/cardiffc/Jenkins_Upgradev3.git','master')
	
	} 

}

