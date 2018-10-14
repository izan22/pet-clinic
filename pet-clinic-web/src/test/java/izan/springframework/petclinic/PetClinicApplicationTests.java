package izan.springframework.petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetClinicApplicationTests {

	@Test
	public void contextLoads() {
		List mockedList = mock(List.class);

		mockedList.add("one");
		mockedList.clear();

		verify(mockedList).add("one");
	}

}
