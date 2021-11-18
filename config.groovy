common {
    group='net.unicon.iam.shibboleth'

    //# Library Versions
    commonslang3.version='3.11'
    guava.version='31.0.1-jre'
    hibernate.version='5.5.0.Final'
    jackson.version='2.13.0'
    javax.mail.version='1.6.2'
    junit.jupiter.version='5.8.1'
    ldaptive.version='2.1.0'
    lombok.version='1.18.22'
    netty.version='4.1.65.Final'
    servlet.version='4.0.1'
    shibboleth.version='4.1.4'
    spring.version='5.3.9'
    springboot.version='2.4.2'
    springdata.version='2.4.3'
    unboundid.version='6.0.2'

    //# DB Driver versions
    h2.version='1.4.200'
    mariadb.version='2.2.0'
    mysql.version='5.1.48'
    postgres.version='42.3.1'

    //# These should be set in your global `gradle.properties` file - the values here are only for testing/validation of build
    //signing.keyId=6675C13B
    //signing.password=iamtestingkey
    //signing.secretKeyRingFile=./iamtest.gpg
}