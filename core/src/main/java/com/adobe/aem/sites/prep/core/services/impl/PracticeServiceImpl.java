package com.adobe.aem.sites.prep.core.services.impl;

import com.adobe.aem.sites.prep.core.services.PracticeService;
import org.osgi.service.component.annotations.Component;

@Component (service = PracticeService.class)
public class PracticeServiceImpl implements PracticeService {

    @Override
    public String getName() {
        return "get name string";
    }
}
