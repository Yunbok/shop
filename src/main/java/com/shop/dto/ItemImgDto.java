package com.shop.dto;


import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ItemImgDto {

    private static ModelMapper modelMapper = new ModelMapper();

    private Long id;

    private String imgName;

    private String imgUrl;

    private String repImgYn;

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg, ItemImgDto.class);
    }
}
