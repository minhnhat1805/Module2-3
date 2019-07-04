package dn.cg.tm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import dn.cg.tm.entity.ClassRoom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
  public  class ProductControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllProducts() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/products",
				HttpMethod.GET, entity, String.class);
		
		assertNotNull(response.getBody());
	}

	@Test
	public void testGetClassRoomById() {
		ClassRoom classRoom =  restTemplate.getForObject(getRootUrl() + "/classRooms/1", ClassRoom.class);
		System.out.println((classRoom.getName()));
		assertNotNull(classRoom);
	}

	@Test
	public void testCreateClassRoom() {
		ClassRoom classRoom = new ClassRoom();
		classRoom.setName("admin");
		classRoom.setDeleted(true);
		classRoom.setLearningStatus("learning");

		ResponseEntity<ClassRoom> postResponse = restTemplate.postForEntity(getRootUrl() + "/classRooms", classRoom, ClassRoom.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	@Test
	public void testUpdateClassRoom() {
		int id = 1;
		ClassRoom classRoom = restTemplate.getForObject(getRootUrl() + "/classRooms/" + id, ClassRoom.class);
		classRoom.setName("admin1");
		classRoom.setLearningStatus("finish");

		restTemplate.put(getRootUrl() + "/classRooms/" + id, classRoom);

		ClassRoom updatedClassRoom = restTemplate.getForObject(getRootUrl() + "/classRooms/" + id, ClassRoom.class);
		assertNotNull(updatedClassRoom);
	}

	@Test
	public void testDeleteClassRoom() {
		int id = 2;
		ClassRoom classRoom = restTemplate.getForObject(getRootUrl() + "/classRooms/" + id, ClassRoom.class);
		assertNotNull(classRoom);

		restTemplate.delete(getRootUrl() + "/classRooms/" + id);

		try {
			classRoom = restTemplate.getForObject(getRootUrl() + "/classRooms/" + id, ClassRoom.class);
		} catch (final HttpClientErrorException e) {

		}
	}
}
