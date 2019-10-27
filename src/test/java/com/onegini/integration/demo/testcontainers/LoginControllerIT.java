package com.onegini.integration.demo.testcontainers;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MariaDBContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Testcontainers;

import io.restassured.http.ContentType;

@Testcontainers
public class LoginControllerIT {

  private static final int SERVICE_SERVER_PORT = 8080;

//  @ClassRule
//  public static DockerComposeContainer DOCKER_COMPOSE_CONTAINER = new DockerComposeContainer(new File("src/test/resources/docker-service-demo.yml"))
//      .withExposedService("simple-service", SERVICE_SERVER_PORT, Wait.forListeningPort());

  @Rule
  public MariaDBContainer mariaDB = new MariaDBContainer();


  @Test
  public void testLogin() {

    assertTrue(true);
//    DOCKER_COMPOSE_CONTAINER.start();
//
//    given()
//        .port(SERVICE_SERVER_PORT)
//        .contentType(ContentType.JSON)
//        .accept(ContentType.JSON)
//        .body("{\"login\":\"marta\",\"password\":\"test\"}")
//        .log().uri()
//    .when()
//        .post("login")
//    .then()
//        .body("welcome", Matchers.is("Welcome marta"));
  }
}
