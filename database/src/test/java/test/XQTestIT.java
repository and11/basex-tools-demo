package test;

import com.github.and11.basex.utils.Option;
import com.github.and11.basex.utils.test.XQUnitSuiteRunner;
import com.github.and11.basex.utils.test.annotations.Configuration;
import com.github.and11.basex.utils.test.annotations.Suites;
import org.junit.runner.RunWith;

import static com.github.and11.basex.utils.CoreOptions.database;
import static com.github.and11.basex.utils.CoreOptions.document;
import static com.github.and11.basex.utils.CoreOptions.mavenBundle;
import static com.github.and11.basex.utils.CoreOptions.options;
import static com.github.and11.basex.utils.CoreOptions.repository;
import static com.github.and11.basex.utils.CoreOptions.url;

@RunWith(XQUnitSuiteRunner.class)
@Suites({"classpath:test.xq"})
public class XQTestIT {

    @Configuration
    public static Option[] opts() {
        return options(
                repository(mavenBundle().groupId("com.github.and11")
                        .artifactId("xquery-functions").type("xar").versionAsInProject()).xar()
        );
    }


}
