job('Build Code DSL') {
	description('Build code for ${new Date()}')
	logRotator {
		numToKeep(5)
        	artifactNumToKeep(5)
	}
	
	scm() {
		git('https://github.com/cardiffc/Jenkins_Upgradev3.git',mater)
	
	} 

}

