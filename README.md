# SpringBoot

All these classes are under the same package in which the main application class resides,
when i run app class, i get the following error

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.saurabh.practisespringconfig.Bike.run()" because "com.saurabh.practisespringconfig.App.bike" is null
at com.saurabh.practisespringconfig.App.main(App.java:12)

since all classes are under same package i should not be using component scan,
my question is why the bike is null? it should not be null as spring boot handles the autoconfiguration.
