pipeline
 {
    agent any

    stages
	{
        stage('Build')
		{
            steps
			{
               bat  "javac Student.java"
            }
       
		}
		stage('Test')
		{ 
            steps
			{
                bat '''javac -cp junit-4.12.jar;studentTest.java 
                
                '''
            }
		}
	}
}