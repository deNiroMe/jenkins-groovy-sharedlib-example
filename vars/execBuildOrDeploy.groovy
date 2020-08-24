def call(String command) {
	
	if( command == "build" ) {	
		pipeline{
			agent any 
			stages {
				stage("Build") {
					echo "Build is executing ..."
				}
			}
		}	
	} else if ( command == "deploy" ) {	
		pipeline{
			agent any 
			stages {
				stage("Build") {
					echo "deploy is executing ..."
				}
			}
		}	
	} else {	
		pipeline{
			agent any 
			stages {
				stage("Build") {
					echo "Nothing is specified"
				}
			}
		}	
	} 
	
}