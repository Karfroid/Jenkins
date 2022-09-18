pipeline{

    agent any

    parameters{
            choice(name: "VERSION", choices: ["1.0.0","1.0.1","2.0.0"], description:"")
            booleanParam(name: 'pullcode', defaultValue: true, description:'')
    }

    stages{

        stage("Code Pull"){
                when{
                    expression{
                        param.pullcode == true
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
                }
				}
		stage('regression test'){
					steps{
                        echo "Code is tested"
                }
					}


    }

}
