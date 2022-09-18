pipeline{

    agent any

    parameters{
            choice(name: "VERSION", choices: ["1.0.0","1.0.1","2.0.0"], description:"")
            booleanParam(name: 'pullcode', defaultValue: false, description:'')
    }

    stages{

        stage("Code Pull"){
                when{
                    expression{
                        params.pullcode == true
                    }
                }
                steps{
                        echo "Code is pulled"
                }
        }
        stage('build'){
					steps{
                        echo "Code is built"
                }
				}
		stage('quality gate'){
					steps{
                        echo "Code is quality tested"
                }
				     }
		stage('deploy'){
					steps{
                        echo "Code is deployed"
			echo "Code version deployed is ${params.VERSION}"			
                }
				}
		stage('regression test'){
					steps{
                        echo "Code is tested"
                }
					}


    }

}
