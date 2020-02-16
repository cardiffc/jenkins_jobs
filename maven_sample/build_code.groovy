job('Build 2 via DSL') {
	description('Build code for ${new Date()}')
        discardOldBuilds(daysToKeep = 5, numToKeep = 5)
	scm('*****') {
		github('https://github.com/cardiffc/Jenkins_Upgradev3.git')
	
	} 

}

