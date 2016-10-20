package store.logic;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import domain.Bucketlist;
import store.pacade.BucketlistStore;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BucketlistStoreLogicTest {

	private BucketlistStore store;
	
	@Before
	public void init(){
		store = new BucketlistStoreLogic();
	}
	
//	@Test
//	public void test1InsertBucketlist() {
//		Bucketlist bucketlist = new Bucketlist();
//		
//		bucketlist.setGoal("asw");
//		bucketlist.setLock(true);
//		bucketlist.setMemo("qert");
//		bucketlist.setSos("asgw");
//		bucketlist.setStar(5);
//		bucketlist.setTitle("hqeat");
//		bucketlist.setUserId("박유저");
//		
//		assertEquals(1, store.insertBucketlist(bucketlist));
//	}
//
//	@Test
//	public void test2UpdateBucketlist() {
//		Bucketlist bucketlist = new Bucketlist();
//		
//		bucketlist.setBucketlistId(8);
//		bucketlist.setGoal("asdgg");
//		bucketlist.setLock(true);
//		bucketlist.setMemo("asde");
//		bucketlist.setSos("asgwe");
//		bucketlist.setStar(5);
//		bucketlist.setTitle("asdafg");
//		bucketlist.setUserId("김유저");
//		
//		assertEquals(1, store.updateBucketlist(bucketlist));
//		assertEquals("asde", store.selectBucketlistByBucketlistId(8).getMemo());
//		assertEquals("asdgg", store.selectBucketlistByBucketlistId(8).getGoal());
//		
//	}
//
//	@Test
//	public void test3DeleteBucketlist() {
//		assertEquals(1, store.deleteBucketlist(8));
//	}
//	
//	@Test
//	public void test4SelectAll() {
//		List<Bucketlist> bList = store.selectAll();
//		assertEquals(2, bList.size());
//		assertEquals("김유저", bList.get(0).getUserId());
//		
//	}
//
//	@Test
//	public void test5SelectBucketlistByBucketlistId() {
//		assertNotNull(store.selectBucketlistByBucketlistId(9));
//		assertNotNull(store.selectBucketlistByBucketlistId(10));
//		assertEquals("김유저", store.selectBucketlistByBucketlistId(9).getUserId());
//		assertEquals("박유저", store.selectBucketlistByBucketlistId(10).getUserId());
//		
//	}
//
//	@Test
//	public void test6SelectBucketlistsByConnChains() {
//		fail("Not yet implemented");
//	}

}
