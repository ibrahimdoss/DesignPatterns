package postCodeSingletonExample;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		PostCodeService postCodeService = PostCodeServiceEnum.INSTANCE;
		
		List<PostCode> codes = postCodeService.getPostCodes(new City("Istanbul"));
		PostCode code = postCodeService.getPostCode(new City("Istanbul"), new Street("Sariguzel"));
		
		System.out.println(code);
		System.out.println(codes);

	
	}
}
