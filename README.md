# first-spring-project

This is a demo project to exemplify the following spring features:

 - XML Setup
   - Service dependency injection
   - Setter dependency injection
   - Injecting literal values
   - Reading values from properties file to add context on `applicationContext.xml`
   - Bean Scopes (`singleton` and `prototype`)
   - Bean lifecycle hooks (`init-method` and `destroy-method`)

 - Annotation Setup
   - Usage of `@Component(<bean id>)` approach on Java classes
   - Usage of the `@Autowired` annotation on Constructor, methods and directly on fields to inject dependencies
   - Usage of the `@Qualifier` annotation to select a FortuneService between HappyFortuneService and SadFortuneService implementations (`TennisCoach.java`)
   - `@Value` annotations to read properties values injected
   - `@PostConstruct` and `@PreDestroy` annotations to add lifecycles to a class (`TrackCoach.java`)

- Spring Configuration only with java class
  - (`SportConfig.java`) setting up Spring stuff, no needing of any XML file
  - see `JavaConfigDemoApp` for loading and running with this configuration
  - setup of a class to be a bean without `@Component` (usage of `SwimCoach` on `SportConfig`)

To Run the code, go to `HelloSpringApp.java` and look for the output.

To see the logic, look the xml `applicationContext.xml` and `bean-scope-test-applicationContext.xml` where the dependencies are being settle