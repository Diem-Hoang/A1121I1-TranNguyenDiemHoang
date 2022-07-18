package com.codegym.controller;

import com.codegym.entity.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @ModelAttribute("blog")
    public Blog init() {
        return new Blog();
    }

//    List Blog
    @GetMapping("/list")
    public String display(Model model) {
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        return "list";
    }

//    View Blog
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "view";
    }

//    Create Blog
    @GetMapping("/create")
    public String viewCreate() {
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog) {
        iBlogService.create(blog);
        return "redirect:/list";
    }

//    Edit Blog
    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog) {
        iBlogService.update(blog);
        return "redirect:/list";
    }

//    Search
    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<Blog> blogList = iBlogService.search(name);
        model.addAttribute("blogList", blogList);
        return "/list";
    }

//    Delete
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        iBlogService.delete(id);
        return "redirect:/list";
    }

}
