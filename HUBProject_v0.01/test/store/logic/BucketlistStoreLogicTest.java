package store.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.Bucketlist;
import store.pacade.BucketlistStore;

public class BucketlistStoreLogicTest {

	private BucketlistStore store;
	
	@Before
	public void init(){
		store = new BucketlistStoreLogic();
	}
	
//	@Test
//	public void testInsertBucketlist() {
//		Bucketlist bucketlist = new Bucketlist();
//		
//		bucketlist.setGoal("asdf");
//		bucketlist.setLock(true);
//		bucketlist.setMemo("asd");
//		bucketlist.setSos("asgwe");
//		bucketlist.setStar(5);
//		bucketlist.setTitle("asdafg");
//		bucketlist.setUserId("±èÀ¯Àú");
//		
//		assertEquals(1, store.insertBucketlist(bucketlist));
//	}

	@Test
	public void testUpdateBucketlist() {
		Bucketlist bucketlist = new Bucketlist();
		
		bucketlist.setGoal("asdgg");
		bucketlist.setLock(true);
		bucketlist.setMemo("asde");
		bucketlist.setSos("asgwe");
		bucketlist.setStar(5);
		bucketlist.setTitle("asdafg");
		bucketlist.setUserId("±èÀ¯Àú");
		
		assertEquals(1, store.updateBucketlist(bucketlist));
		assertEquals("asde", store.selectBucketlistByBucketlistId(7).getMemo());
		assertEquals("asdgg", store.selectBucketlistByBucketlistId(7).getGoal());
		
	}

//	@Test
//	public void testDeleteBucketlist() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectBucketlistByBucketlistId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectBucketlistsByConnChains() {
//		fail("Not yet implemented");
//	}

}
