pipeline{

    agent any

    parameters{
            choice(name: "VERSION", choices: ["1.0.0","1.0.1","2.0.0"], description:"")
            booleanParam(name: 'pullcode',defaultvalue: false,description:'')
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
					echo 'code is built'
				}
		stage('quality gate'){
					echo 'code is quality check'
				     }
		stage('deploy'){
					echo 'deployed'
				}
		stage('regression test'){
					echo 'testing is done'
					}


    }

}
