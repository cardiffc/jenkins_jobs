job('Build Code DSL') {
	description('Build code for ${new Date()}')
        discardOldBuilds(int daysToKeep = 5, int numToKeep = 5)
	scm('*****') {
		github('https://github.com/cardiffc/Jenkins_Upgradev3.git')
	
	} 

}

