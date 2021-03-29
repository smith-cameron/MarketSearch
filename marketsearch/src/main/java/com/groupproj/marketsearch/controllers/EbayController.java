package com.groupproj.marketsearch.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("https://price-analytics.p.rapidapi.com/job")
public class EbayController {
//	@Value("api.key")
//	private String apiKey
//	@Autowired
//	private RestTemplate restTemplate
//	
//	
//	@Getmapping("/itemid")
//	public item getItemInfo()@PathVariable("item") String item){
//		HttpResponse<String> response = Unirest.post("https://price-analytics.p.rapidapi.com/job")
//				.header("content-type", "application/x-www-form-urlencoded")
//				.header("x-rapidapi-key", "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f")
//				.header("x-rapidapi-host", "price-analytics.p.rapidapi.com")
//				.body("source=amazon&key=gtin&country=de&values=%3CREQUIRED%3E")
//				.asString();
//			
	
//	HttpResponse<String> response = Unirest.get("https://ebay-com.p.rapidapi.com/products/647865100010")
//			.header("x-rapidapi-key", "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f")
//			.header("x-rapidapi-host", "ebay-com.p.rapidapi.com")
//			.asString();	
	
	
	
	
//	
//	@GetMapping("/search")
//	public String formGet (@ModelAttribute("model") Accessory accessory, Model viewModel) {
//		
//		viewModel.addAttribute("cars", this.cService.getAllCars());
//
//		return "accessory/new.jsp";
//	}
//	@PostMapping("/search")
//	public String formpost(@Valid @ModelAttribute("model") Accessory accessory, BindingResult result, Model viewModel,@RequestParam("item")String) {
//		if(result.hasErrors()) {
//			viewModel.addAttribute("cars", this.cService.getAllCars());
//			return "accessory/new.jsp";
//		}
//		this.aService.create(accessory);
//		return "redirect:/";
//		
}
