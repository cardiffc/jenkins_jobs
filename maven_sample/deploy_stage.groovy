job("Deploy Stage DSL") {
	desription("This job is job for deply sample tomcat to stage via DSL, generated on ${new Date()}")
	logRotator {
		dayToKeep(5)
		numToKeep(5)
	}
	steps {
		copyArtifacts('Build Code DSL') {
			includePatterns('**/*.war')
			buildSelector {
				latestSuccessful(true)
			}
		}
	}
}

