/** @format */
"use client";

import { useState } from "react";
import { Nav } from "./ui/nav";

type Props = {};

import {
  LayoutDashboard,
  UsersRound,
  ChevronRight,
  ChevronLeft,
  BarChart,
  LineChart,
  Settings,
  LogOutIcon,
} from "lucide-react";
import { Button } from "./ui/button";

import { useWindowWidth } from "@react-hook/window-size";
import Image from "next/image";

export default function SideNavbar({}: Props) {
  const [isCollapsed, setIsCollapsed] = useState(false);

  const onlyWidth = useWindowWidth();
  const mobileWidth = onlyWidth < 768;

  function toggleSidebar() {
    setIsCollapsed(!isCollapsed);
  }

  return (
    
    <div className="relative min-w-[100px] border-r px-3  pb-10 pt-4 ">
      <Image src="/JR.png" alt="logo" width="48" height="48" className="mt-6 mb-16 mx-auto"/>
      {!mobileWidth && (
        <div className="absolute right-[-20px] top-7">
          <Button
            onClick={toggleSidebar}
            variant="secondary"
            className=" rounded-full p-2"
          >
            {isCollapsed ? <ChevronRight /> : <ChevronLeft />}
          </Button>
        </div>
      )}
      <Nav
        isCollapsed={mobileWidth ? true : isCollapsed}
        links={[
          {
            title: "Dashboard",
            href: "/",
            icon: LayoutDashboard,
            variant: "default"
          },
          {
            title: "Programas",
            href: "/programas",
            icon: UsersRound,
            variant: "ghost"
          },
          {
            title: "Financeiro",
            href: "/financeiro",
            icon:   BarChart,
            variant: "ghost"
          },
          {
            title: "Recursos",
            href: "/recursos",
            icon: LineChart,
            variant: "ghost"
          },
          {
            title: "Settings",
            href: "/settings",
            icon: Settings,
            variant: "ghost"
          },
          {
            title: "Logout",
            href: "/logout",
            icon: LogOutIcon,
            variant: "ghost"
          }
        ]}
      />
    </div>
  );
}
