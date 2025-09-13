import React from "react";
import { Button } from "@/components/ui/button";
import { Card, CardContent } from "@/components/ui/card";
import { motion } from "framer-motion";

const menuItems = [
  { name: "Margherita Pizza", price: "$12" },
  { name: "Pasta Alfredo", price: "$15" },
  { name: "Caesar Salad", price: "$10" },
  { name: "Tiramisu", price: "$8" }
];

export default function Restaurant() {
  return (
    <div className="min-h-screen bg-gray-100">
      {/* Hero Section */}
      <div className="bg-[url('/restaurant.jpg')] bg-cover bg-center h-[500px] flex items-center justify-center text-white text-center p-6">
        <motion.div initial={{ opacity: 0 }} animate={{ opacity: 1 }} transition={{ duration: 1 }}>
          <h1 className="text-5xl font-bold mb-4">Welcome to Gourmet Haven</h1>
          <p className="text-xl">Experience the best dining in town.</p>
          <Button className="mt-4 bg-red-600 text-white px-6 py-2 rounded-lg">Reserve a Table</Button>
        </motion.div>
      </div>

      {/* Menu Section */}
      <div className="container mx-auto py-12 text-center">
        <h2 className="text-3xl font-bold mb-6">Our Menu</h2>
        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
          {menuItems.map((item, index) => (
            <motion.div key={index} whileHover={{ scale: 1.05 }}>
              <Card className="p-4 shadow-lg">
                <CardContent>
                  <h3 className="text-xl font-semibold">{item.name}</h3>
                  <p className="text-gray-700">{item.price}</p>
                </CardContent>
              </Card>
            </motion.div>
          ))}
        </div>
      </div>

      {/* Contact Section */}
      <div className="bg-gray-800 text-white py-12 text-center">
        <h2 className="text-3xl font-bold mb-4">Contact Us</h2>
        <p>Email: contact@gourmethaven.com</p>
        <p>Phone: (123) 456-7890</p>
      </div>
    </div>
  );
}
