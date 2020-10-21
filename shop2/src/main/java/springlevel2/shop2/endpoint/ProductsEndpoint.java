package springlevel2.shop2.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import springlevel2.shop2.dto.ProductDto;
import springlevel2.shop2.service.ProductService;
import springlevel2.shop2.ws.products.GetProductsRequest;
import springlevel2.shop2.ws.products.GetProductsResponse;
import springlevel2.shop2.ws.products.ProductWS;

import javax.xml.datatype.DatatypeConfigurationException;

@Endpoint
public class ProductsEndpoint {

    public static final String NAMESPACE_URL = "http://bolshakov.pro/geekbrains/springleveltwo/shop/ws/products";

    private final ProductService productService;

    public ProductsEndpoint(ProductService productService) {
        this.productService = productService;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getProductsRequest")
    @ResponsePayload
    public GetProductsResponse getGreeting(@RequestPayload GetProductsRequest request)
            throws DatatypeConfigurationException {
        GetProductsResponse response = new GetProductsResponse();
        productService.getAll()
                .forEach(dto -> response.getGreeting().add(createProductWS(dto)));
        return response;
    }

    private ProductWS createProductWS(ProductDto dto){
        ProductWS ws = new ProductWS();
        ws.setId(dto.getId());
        ws.setPrice(dto.getPrice());
        ws.setTitle(dto.getTitle());
        return ws;
    }
}
