job("Deploy Stage DSL") {
	description("This job is job for deply sample tomcat to stage via DSL, generated on ${new Date()}")
	logRotator {
		daysToKeep(5)
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

