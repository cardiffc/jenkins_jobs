job('Build Code DSL') {
	description("Build code for maven tomcat in new pipeline, generated on ${new Date()}")
	logRotator {
		daysToKeep(5) 
		numToKeep(5)
	}

	
	scm() {
		git('https://github.com/cardiffc/Jenkins_Upgradev3.git','master')
	
	} 

	triggers() {
		scm('* * * * *')
	}
	steps() {
		maven('clean package', 'maven-samples/single-module/pom.xml')	
	}

}

