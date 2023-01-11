# README FOR SPECTROGRAM GENERATOR

Théo Souchon,
Michelle Pepe,
Mohameden Mouhamedda,


## In Application :

The source code of the projet (what you should open in your IDE)
	It is configured as a maven projet (see the pom.xml for what librairies is used)
	The main class of the project is called "Main" or "HelloWorld" (according the version) located in src/application
	It is based on MVC format (application = Model, interfaces = View, controller = Controller) and images for some ressources
	
	NOTE : You need to have a data base working while starting the app (xampp or wampserver), the database template is in the file "admin.sql"
	NOTE2 : The acounts you can used without creating an account are present in the "users" table of the file "admin.sql"
	NOTE3 : The application can only convert .wav file
	NOTE4 : You must have the python environment on your computer (example Windows os : Microsoft Store -> install python 3.10 then open the cmd console and type "pip install scipy"
,"pip install matplotlib", "pip install numpy"

## In Documentation :

	The report.
	The diagrams used in the report (to check it better than in the report).

## In PythonExample :

Differents algorithms to generate spectrogram ("BlacknWhite", "Green", "Purple"), the application use the "Green" one.
	Some musical keys to test the spectrogram in the folder musicalKeys (these are real musical keys created with instrument)
	The spectrogram of each algorithms (BlacknWhite, Green, Purple) for each muscial keys in allSpectrograms
	The greenSpectrogram (the one of the app) for each muscial keys.
	
	NOTE: "test4_a" is an other algorithm present in the report


