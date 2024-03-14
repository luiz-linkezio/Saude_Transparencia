/** @format */

import PageTitle from "@/components/PageTitle";

export default function Home() {
  return (
    <div className="flex flex-col gap-5 w-full">
      <PageTitle title="Dashboard" />
      <div className="h-[720px] w-[1220px] relative after:content-[''] after:w-full after:h-16 after:bg-white after:absolute after:bottom-0 after:left-0 after:z-10">
        <iframe 
          width="1220" 
          height="720" 
          src="https://app.powerbi.com/view?r=eyJrIjoiZjk3ZmE2ZGYtN2JiMS00ZjY4LWI1YjYtMmJlYmUwY2E2OWU3IiwidCI6ImUyZjc3ZDAwLTAxNjMtNGNmNi05MmIwLTQ4NGJhZmY5ZGY3ZCJ9&pageName=ReportSection97043e623fe856549ef8" 
          frameBorder="0" 
          className="" 
          allowFullScreen={true} >
        </iframe>
      </div>  
    </div>
  );
}
