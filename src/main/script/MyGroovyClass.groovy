import java.util.logging.Logger

class MyGroovyClass {
    def LOGGER = Logger.getLogger(MyGroovyClass.getName())

    def myMethod(project){
        LOGGER.info("Your method is beeing called in this project: "+project);
        LOGGER.info("Your target folder is: "+project.build.directory)
    }
}