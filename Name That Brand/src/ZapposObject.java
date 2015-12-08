//ZapposItem is a class that represents a single object from the ecommerce web site for Zappos.com. 
public class ZapposObject {


	private String productId, brandName, productName, thumbnailImageUrl, originalPrice, price, percentOff, productUrl, defaultImageUrl;
	public ZapposObject(String productName, String percentOff, String productId, String brandName) {
		this.productName = productName;
		this.percentOff = percentOff;
		this.productId = productId;
		this.brandName = brandName;
	}
	public ZapposObject() {
		this.productId = "";
		this.productName = "";
		this.brandName = "";
		this.originalPrice = "";
		this.percentOff = "0";
		this.price = "";
		this.productUrl = "";
	}

	// Product ID
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	// Product Name
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	// Brand Name
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	// Default Image URL
	public String getDefaultImageUrl() {
		return defaultImageUrl;
	}

	public void setDefaultImageUrl(String defaultImageUrl) {
		this.defaultImageUrl = defaultImageUrl;
	}

	// Thumbnail Image URL
	public String getThumbnailImageUrl() {
		return thumbnailImageUrl;
	}

	public void setThumbnailImageUrl(String thumbnailImageUrl) {
		this.thumbnailImageUrl = thumbnailImageUrl;
	}

	// Price
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	// Original Price
	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	// Percent Off
	public String getPercentOff() {
		return percentOff;
	}

	public void setPercentOff(String percentOff) {
		this.percentOff = percentOff;
	}
	// Product URL
	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	
}