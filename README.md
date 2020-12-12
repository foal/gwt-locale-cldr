![Maven Central](https://img.shields.io/maven-central/v/org.jresearch.gwt.locale/org.jresearch.gwt.locale.cldr?style=plastic)

## GWT java.util.Locale CLDR data
Project provides list of all supported CLDR locations

Issues about the adaptation should be reported here at GitHub.

### Using

* Add the following project dependency to pom.xml
```
<dependency>
    <groupId>org.jresearch.gwt.locale</groupId>
    <artifactId>org.jresearch.gwt.locale.cldr</artifactId>
    <version>1.0.0</version>
</dependency>
```
* Add `<inherits name="org.jresearch.threetenbp.gwt.module"/>` to your module.gwt.xml, if you use gwt-maven-plugin form Thomas Broyer (https://github.com/tbroyer/gwt-maven-plugin) it will be done automatically

### Releases
Available in the [Maven Central repository](https://search.maven.org/search?q=g:org.jresearch.gwt.locale)

### Support
GitHub [issues](https://github.com/foal/gwt-locale-cldr/issues) and [pull requests](https://github.com/foal/gwt-locale-cldr/pulls) should be used when you want to help advance the project.

### Building from sources
* check out [APT project](https://github.com/foal/gwt-time-apt) and INSTALL (`mvn clean install`) it.
* check out this project
* `mvn clean install`
* The project use the parent pom located on Sonatype snapshot repository.
```
<repositories>
    <repository>
        <id>oss.sonatype.org-snapshot</id>
        <url>http://oss.sonatype.org/content/repositories/snapshots</url>
        <releases><enabled>false</enabled></releases>
        <snapshots><enabled>true</enabled></snapshots>
    </repository>
</repositories>
```
or download directly https://oss.sonatype.org/content/repositories/snapshots/org/jresearch/org.jresearch.pom/29-SNAPSHOT/
