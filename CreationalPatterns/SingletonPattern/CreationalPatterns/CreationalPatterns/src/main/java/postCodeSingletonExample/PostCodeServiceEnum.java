package postCodeSingletonExample;

import java.util.List;

public enum PostCodeServiceEnum implements PostCodeService{
	
	INSTANCE;

	@Override
	public PostCode getPostCode(City city, Neighborhood neighborhood) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostCode getPostCode(City city, Street street) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostCode> getPostCodes(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostCode> getPostCodesAround(PostCode postCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
