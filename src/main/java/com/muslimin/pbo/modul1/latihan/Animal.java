/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muslimin.pbo;

class Animal {
   public void walk() {
       System.out.println(getClass().getSimpleName() + " walk!");
   }
}

class Cat extends Animal {
   @Override
   public void walk() {
       System.out.println("Yeay! " + getClass().getSimpleName() + " walk!");
   }
}
